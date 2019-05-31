package com.io7m.pdf.api

interface PDFViewersType {

  fun canSupport(request: PDFViewersRequest): Boolean

  fun createViewer(request: PDFViewersRequest): PDFViewerType

}