package com.example.act4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Act4(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(R.drawable.prabwowo),
            contentDescription = stringResource(R.string.desc_background),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(R.color.overlay_dark))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(dimensionResource(R.dimen.screen_padding)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.header_title),
                color = colorResource(R.color.text_white),
                fontSize = dimensionResource(R.dimen.text_header).value.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.header_subtitle),
                color = colorResource(R.color.text_white),
                fontSize = dimensionResource(R.dimen.text_subheader).value.sp,
                fontWeight = FontWeight.Bold
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(
                    dimensionResource(R.dimen.card_spacing),
                    Alignment.CenterVertically
                )
            ) {
                ProfileCard(
                    name = stringResource(R.string.name_amba),
                    location = stringResource(R.string.loc_amba),
                    photo = R.drawable.amba,
                    cardColor = colorResource(R.color.card_gray),
                    locationColor = colorResource(R.color.text_yellow),
                    nameFont = FontFamily.Cursive
                )
                ProfileCard(
                    name = stringResource(R.string.name_rusdi),
                    phone = stringResource(R.string.phone_rusdi),
                    location = stringResource(R.string.loc_rusdi),
                    photo = R.drawable.a,
                    cardColor = colorResource(R.color.card_purple),
                    locationColor = colorResource(R.color.text_yellow)
                )
                ProfileCard(
                    name = stringResource(R.string.name_fuad),
                    phone = stringResource(R.string.phone_fuad),
                    location = stringResource(R.string.loc_fuad),
                    photo = R.drawable.fuad,
                    cardColor = colorResource(R.color.card_blue),
                    locationColor = colorResource(R.color.text_white)
                )
                ProfileCard(
                    name = stringResource(R.string.name_lilnusnus),
                    phone = stringResource(R.string.phone_lilnusnus),
                    location = stringResource(R.string.loc_lilnusnus),
                    photo = R.drawable.lilnusnus,
                    cardColor = colorResource(R.color.card_green),
                    locationColor = colorResource(R.color.text_white)
                )
                ProfileCard(
                    name = stringResource(R.string.name_rafli),
                    phone = stringResource(R.string.phone_rafli),
                    location = stringResource(R.string.loc_rafli),
                    photo = R.drawable.saya,
                    cardColor = colorResource(R.color.card_orange),
                    locationColor = colorResource(R.color.text_white)
                )
            }

            Text(
                text = stringResource(R.string.footer_copyright),
                color = colorResource(R.color.text_white),
                fontSize = dimensionResource(R.dimen.text_footer).value.sp
            )
        }
    }
}


@Composable
fun ProfileCard(
    name: String,
    location: String,
    photo: Int,
    cardColor: Color,
    locationColor: Color,
    modifier: Modifier = Modifier,
    phone: String? = null,
    nameFont: FontFamily? = null
) {
    