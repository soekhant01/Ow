package com.example.oway.ui.screens.onboarding_screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.oway.ui.components.CircularProgressButton
import com.example.oway.ui.components.OnBoardingCard
import org.jetbrains.compose.resources.painterResource
import oway.composeapp.generated.resources.Res
import oway.composeapp.generated.resources.onBoardingScreen3
import kotlinx.coroutines.launch
import oway.composeapp.generated.resources.onBoardingScreen1
import oway.composeapp.generated.resources.onBoardingScreen2

@Composable
fun OnBoardingScreen(
) {

    val pages = listOf(
        OnBoardingPage(
            title = "Anywhere you are",
            description = "Sell houses easily with the help of Listenoryx and to make this line big I am writing more.",
            image = painterResource(Res.drawable.onBoardingScreen1)
        ),
        OnBoardingPage(
            title = "At anytime",
            description = "Sell houses easily with the help of Listenoryx and to make this line big I am writing more.",
            image = painterResource(Res.drawable.onBoardingScreen2)
        ),
        OnBoardingPage(
            title = "Book your car",
            description = "Sell houses easily with the help of Listenoryx and to make this line big I am writing more.",
            image = painterResource(Res.drawable.onBoardingScreen3)
        )
    )
    val coroutineScope = rememberCoroutineScope()

    val pageCount = pages.size

    val pagerState = rememberPagerState(initialPage = 0, pageCount = { pageCount })

    val progress = (pagerState.currentPage + 1) / pageCount.toFloat()
    val isLastPage = pagerState.currentPage == pageCount - 1

    Column(

    ) {
        HorizontalPager(

            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            OnBoardingCard(page = pages[page])
        }

//        Bottom Button
        Box(
            modifier = Modifier.padding(40.dp).fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressButton(
                isLast = isLastPage,
                progress = progress,
                onClick = {
                    if (!isLastPage)
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    else println("Finished")
                },


            )
        }
        Spacer(Modifier.height(40.dp))
    }
}