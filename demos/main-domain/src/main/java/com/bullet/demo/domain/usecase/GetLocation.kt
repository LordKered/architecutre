package com.bullet.demo.domain.usecase

import com.bullet.architecture.domain.entities.Either
import com.bullet.architecture.domain.entities.failure.Failure
import com.bullet.architecture.domain.usecase.AsyncUseCase
import com.bullet.architecture.domain.usecase.UseCase
import com.bullet.demo.domain.entities.LocationEntity
import com.bullet.demo.domain.repository.LocationRepository

class GetLocation(private val repository: LocationRepository) : AsyncUseCase<LocationEntity>() {

    override suspend fun execute(param: UseCase.Params?): Either<Failure, LocationEntity> {
        return repository.getLocation()
    }
}