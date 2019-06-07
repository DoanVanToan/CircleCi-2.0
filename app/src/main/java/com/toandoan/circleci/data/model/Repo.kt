package com.toandoan.circleci.data.model

data class Repo(
    val id: Int,
    val nodeId: String,
    var fullName: String,
    var isPrivate: Boolean,
    var owner: User
)
