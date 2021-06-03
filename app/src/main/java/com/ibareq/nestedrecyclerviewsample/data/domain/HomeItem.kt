package com.ibareq.nestedrecyclerviewsample.data.domain

import com.ibareq.nestedrecyclerviewsample.data.domain.enums.HomeItemType

data class HomeItem<T>(
    val item: T,
    val type: HomeItemType,
)