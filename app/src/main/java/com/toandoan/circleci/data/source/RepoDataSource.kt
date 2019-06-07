package com.toandoan.circleci.data.source

import androidx.lifecycle.LiveData
import com.toandoan.circleci.data.model.Repo

interface RepoDataSource {
    fun getRepos(): LiveData<MutableList<Repo>>
}