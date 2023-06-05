package my.lovely.bookquiz.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import my.lovely.bookquiz.domain.repository.BookRepository
import my.lovely.bookquiz.domain.usecase.GetRandomBooksUseCase

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetRandomBooksUseCase(bookRepository: BookRepository): GetRandomBooksUseCase {
        return GetRandomBooksUseCase(bookRepository = bookRepository)
    }

}