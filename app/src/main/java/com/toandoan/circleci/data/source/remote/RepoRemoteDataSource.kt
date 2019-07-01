package com.toandoan.circleci.data.source.remote

import androidx.lifecycle.LiveData
import com.toandoan.circleci.data.model.Repo
import com.toandoan.circleci.data.source.RepoDataSource

class RepoRemoteDataSource : RepoDataSource {
    override fun getRepos(): LiveData<MutableList<Repo>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        fun getInstance() = RepoRemoteDataSource()
    }

}