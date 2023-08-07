package com.mazer.estorcedor.model

data class User(
    val userName: String,
    val surname: String,
    val lastname: String,
    val subscriptionPlan: SubscriptionPlan,
    val jwt: String
)