package my.lovely.bookquiz.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import my.lovely.bookquiz.data.BookRepositoryImpl
import my.lovely.bookquiz.domain.repository.BookRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideBookRepositoryImpl() : BookRepository {
        return BookRepositoryImpl()

    }
}