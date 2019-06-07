package com.toandoan.circleci.data.model

data class User(
    val id: Int,
    var login: String,
    var nodeId: String,
    var avatarUrl: String,
    var url: String
)