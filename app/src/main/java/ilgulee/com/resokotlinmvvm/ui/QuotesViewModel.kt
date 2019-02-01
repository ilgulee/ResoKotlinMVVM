package ilgulee.com.resokotlinmvvm.ui

import androidx.lifecycle.ViewModel
import ilgulee.com.resokotlinmvvm.data.model.Quote
import ilgulee.com.resokotlinmvvm.data.repository.QuoteDaoRepository

// QuoteRepository dependency will again be passed in the
// constructor using dependency injection
class QuotesViewModel(private val quoteDaoRepository: QuoteDaoRepository)
    : ViewModel() {

    fun getQuotes() = quoteDaoRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteDaoRepository.addQuote(quote)
}