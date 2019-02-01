package ilgulee.com.resokotlinmvvm.data.db

import androidx.lifecycle.LiveData
import ilgulee.com.resokotlinmvvm.data.model.Quote

interface QuoteDao {
    fun addQuote(quote:Quote)
    fun getQuotes():LiveData<List<Quote>>
}