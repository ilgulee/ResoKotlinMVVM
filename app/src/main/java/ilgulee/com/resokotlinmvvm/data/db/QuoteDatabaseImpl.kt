package ilgulee.com.resokotlinmvvm.data.db

class QuoteDatabaseImpl:QuoteDatabase {
    override val quoteDao: QuoteDao=QuoteDaoFakeImpl()
}