package ilgulee.com.resokotlinmvvm

import android.app.Application
import ilgulee.com.resokotlinmvvm.data.db.QuoteDao
import ilgulee.com.resokotlinmvvm.data.db.QuoteDatabase
import ilgulee.com.resokotlinmvvm.data.db.QuoteDatabaseImpl
import ilgulee.com.resokotlinmvvm.data.repository.QuoteDaoRepository
import ilgulee.com.resokotlinmvvm.data.repository.QuoteDaoRepositoryImpl
import ilgulee.com.resokotlinmvvm.ui.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuoteApplication:Application(),KodeinAware {
    override val kodein=Kodein.lazy{
        bind<QuoteDatabase>() with singleton { QuoteDatabaseImpl() }
        bind<QuoteDao>() with singleton { instance<QuoteDatabase>().quoteDao }
        bind<QuoteDaoRepository>() with singleton { QuoteDaoRepositoryImpl(instance()) }
        bind() from provider { QuotesViewModelFactory(instance()) }
    }
}