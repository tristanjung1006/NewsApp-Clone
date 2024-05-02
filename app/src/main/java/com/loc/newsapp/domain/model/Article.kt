package com.loc.newsapp.domain.model

data class Article(
    val author: String, // Andy Greenberg
    val content: String, // As a test of their resulting AI tool, the researchers checked its outputs with one cryptocurrency exchangewhich the paper doesn't nameidentifying 52 suspicious chains of transactions that had all ult… [+3279 chars]
    val description: String, // Blockchain analysis firm Elliptic, MIT, and IBM, have released a new AI detection model—and the 200-million-transaction dataset it's trained on—that aims to spot the “shape” of Bitcoin money laundering.
    val publishedAt: String, // 2024-05-01T13:00:00Z
    val source: Source,
    val title: String, // A Vast New Dataset Could Supercharge the AI Hunt for Crypto Money Laundering
    val url: String, // https://www.wired.com/story/ai-crypto-tracing-model-money-laundering/
    val urlToImage: String // https://media.wired.com/photos/6631a1936dc0c77846852ed5/191:100/w_1280,c_limit/Crypto-Money-Laundering-Security-GettyImages-1543076825.jpg
)