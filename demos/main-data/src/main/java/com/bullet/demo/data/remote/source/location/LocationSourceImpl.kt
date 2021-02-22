package com.bullet.demo.data.remote.source.location

import com.bullet.architecture.domain.entities.Either
import com.bullet.architecture.domain.entities.failure.Failure
import com.bullet.demo.data.source.LocationSource
import com.bullet.demo.domain.entities.LocationEntity

class LocationSourceImpl : LocationSource {
     override suspend fun fetchLocation(): Either<Failure, LocationEntity> {

    }

}