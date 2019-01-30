package ilgulee.com.resokotlinmvvm.ui

import androidx.lifecycle.ViewModel
import ilgulee.com.resokotlinmvvm.data.Quote
import ilgulee.com.resokotlinmvvm.data.QuoteRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}