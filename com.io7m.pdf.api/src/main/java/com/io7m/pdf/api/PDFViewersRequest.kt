package com.io7m.pdf.api

import java.io.InputStream

data class PDFViewersRequest(
  val type: String,
  val source: InputStream)
