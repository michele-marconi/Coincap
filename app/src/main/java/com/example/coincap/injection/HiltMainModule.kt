package com.example.coincap.injection

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import com.example.coincap.apiservice.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HiltMainModule {

    @Singleton
    @Provides
    fun provideWebService() = RemoteDataSource()

    @Singleton
    @Provides
    fun providePreferences(@ApplicationContext context: Context): SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

}