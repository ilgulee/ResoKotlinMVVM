package ilgulee.com.resokotlinmvvm.data.repository

import androidx.lifecycle.LiveData
import ilgulee.com.resokotlinmvvm.data.model.Quote

interface QuoteDaoRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}