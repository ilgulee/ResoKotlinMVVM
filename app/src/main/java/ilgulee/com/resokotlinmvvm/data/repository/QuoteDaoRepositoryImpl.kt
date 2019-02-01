package ilgulee.com.resokotlinmvvm.data.repository

import ilgulee.com.resokotlinmvvm.data.db.QuoteDao
import ilgulee.com.resokotlinmvvm.data.model.Quote

class QuoteDaoRepositoryImpl(private val quoteDao:QuoteDao):QuoteDaoRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes()=quoteDao.getQuotes()
}