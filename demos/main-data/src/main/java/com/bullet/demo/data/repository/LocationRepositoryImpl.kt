package com.bullet.demo.data.repository

import com.bullet.architecture.domain.entities.Either
import com.bullet.architecture.domain.entities.failure.Failure
import com.bullet.demo.data.source.LocationSource
import com.bullet.demo.domain.entities.LocationEntity
import com.bullet.demo.domain.repository.LocationRepository

class LocationRepositoryImpl(network: LocationSource) : LocationRepository {
    override suspend fun getLocation(): Either<Failure, LocationEntity> {
        TODO("Not yet implemented")
    }
}