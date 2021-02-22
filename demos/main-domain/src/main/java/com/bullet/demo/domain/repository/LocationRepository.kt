package com.bullet.demo.domain.repository

import com.bullet.architecture.domain.entities.Either
import com.bullet.architecture.domain.entities.failure.Failure
import com.bullet.architecture.domain.repository.Repository
import com.bullet.demo.domain.entities.LocationEntity

interface LocationRepository : Repository {
    suspend fun getLocation(): Either<Failure, LocationEntity>
}