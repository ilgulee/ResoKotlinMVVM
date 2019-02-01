package ilgulee.com.resokotlinmvvm.data.db

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ilgulee.com.resokotlinmvvm.data.model.Quote

class QuoteDaoFakeImpl:QuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()
    init {
        // Immediately connect the now empty quoteList
        // to the MutableLiveData which can be observed
        quotes.value = quoteList
    }
    override fun addQuote(quote: Quote) {
        quoteList.add(quote)
        // After adding a quote to the "database",
        // update the value of MutableLiveData
        // which will notify its active observers
        quotes.value = quoteList
    }

    // Casting MutableLiveData to LiveData because its value
    // shouldn't be changed from other classes
    override fun getQuotes() = quotes as LiveData<List<Quote>>
}