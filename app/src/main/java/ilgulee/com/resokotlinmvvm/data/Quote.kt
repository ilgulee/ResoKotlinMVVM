package ilgulee.com.resokotlinmvvm.data

data class Quote(val quoteText: String,
                 val author: String) {

    override fun toString(): String = "$quoteText - $author"

}