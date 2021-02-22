package com.bullet.demo.data.source

import com.bullet.architecture.domain.entities.Either
import com.bullet.architecture.domain.entities.failure.Failure
import com.bullet.architecture.domain.source.Source
import com.bullet.demo.domain.entities.LocationEntity

interface LocationSource : Source {
    suspend fun fetchLocation(): Either<Failure, LocationEntity>
}