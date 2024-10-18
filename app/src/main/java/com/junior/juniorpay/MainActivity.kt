package com.junior.juniorpay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.junior.juniorpay.ui.theme.Black
import com.junior.juniorpay.ui.theme.JuniorPayTheme
import com.junior.juniorpay.ui.theme.Primary
import com.junior.juniorpay.ui.theme.PrimaryVariant
import com.junior.juniorpay.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JuniorPayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues = innerPadding)
                        .padding(10.dp),

                    ) {

                        AppHeader(Modifier)

                        Spacer(Modifier.height(16.dp))

                        BalanceCard(Modifier)

                        Spacer(Modifier.height(16.dp))

                        ActionButtons(Modifier)

                        Spacer(Modifier.height(16.dp))

                        Transactions(Modifier)
                    }

                }
            }
        }
    }
}

@Composable
fun AppHeader(modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Junior Pay",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = PrimaryVariant
            )
        )

        IconButton(
            onClick = {

            }
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "User Account"
            )
        }
    }
}

@Composable
fun BalanceCard(modifier: Modifier = Modifier) {
    Card(modifier = modifier
        .fillMaxWidth()
        .aspectRatio(2 / 1.2f),
        colors = CardDefaults.cardColors(
            containerColor = Primary
        )
    ) {
        Column(modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.End
        ) {

            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = "KES 2000.00",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = White
                        )
                        )
                    Text(
                        text = "Balance",
                        style = TextStyle(
                            color = White.copy(alpha = 0.5f)
                        )
                    )
                }

                Icon(
                    painter = painterResource(id = R.drawable.ic_wallet),
                    contentDescription = "Wallet Icon",
                    modifier = modifier.size(30.dp),
                    tint = White
                )
            }

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = White
                ),
                onClick = {

                }
            ) {
                Text(
                    text = "DEPOSIT",
                    color = Black,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun ActionButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(
            16.dp,
            Alignment.CenterHorizontally
        ),
    ) {
        Box (
            modifier = modifier
                .clickable{
                },
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_scanner),
                contentDescription = "Scanner Icon",
                modifier = modifier.size(60.dp)
            )
        }
        Box (
            modifier = modifier
                .clickable{
                },
            contentAlignment = Alignment.Center,
        )  {
            Icon(
                painter = painterResource(id = R.drawable.ic_send),
                contentDescription = "Send Icon",
                modifier = modifier.size(60.dp)
            )
        }
        Box (
            modifier = modifier
                .clickable{
                },
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_withdraw),
                contentDescription = "Withdraw Icon",
                modifier = modifier.size(60.dp)
            )
        }
    }
}

@Composable
fun Transactions(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Transactions",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Text(
                text = "see all",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = PrimaryVariant
                )
            )
        }

        Spacer(Modifier.height(16.dp))

        LazyColumn {
            items(5) {
                Row(
                    modifier = modifier.fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = "Transaction Icon"
                        )

                        Spacer(modifier.width(16.dp))

                        Column {
                            Text(
                                text = "Top up",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    letterSpacing = 2.sp
                                )
                            )
                            Text(
                                "Today 1:53 pm",
                                fontWeight = FontWeight.Light
                            )
                        }
                    }


                    Column(horizontalAlignment = Alignment.End) {
                        Text(
                            text = "+kes 300",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp
                            )
                        )
                        Text(text = "Deposit", fontWeight = FontWeight.Light)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun DashboardPreview() {
    JuniorPayTheme {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),

            ) {

            AppHeader(Modifier)

            Spacer(Modifier.height(16.dp))

            BalanceCard(Modifier)

            Spacer(Modifier.height(16.dp))

            ActionButtons(Modifier)

            Spacer(Modifier.height(16.dp))

            Transactions(Modifier)
        }
    }
}