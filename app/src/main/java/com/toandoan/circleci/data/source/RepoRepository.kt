package com.toandoan.circleci.data.source

import androidx.lifecycle.LiveData
import com.toandoan.circleci.data.model.Repo

class RepoRepository(private val remoteDataSource: RepoDataSource) : RepoDataSource {
    override fun getRepos(): LiveData<MutableList<Repo>> = remoteDataSource.getRepos()
}