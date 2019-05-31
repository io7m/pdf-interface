package com.io7m.pdf.pdfviewer

import com.io7m.pdf.api.PDFViewerType
import com.io7m.pdf.api.PDFViewersRequest
import com.io7m.pdf.api.PDFViewersType

class PVViewers : PDFViewersType {

  override fun canSupport(request: PDFViewersRequest): Boolean {
    return request.type == "application/pdf"
  }

  override fun createViewer(request: PDFViewersRequest): PDFViewerType {
    return PVViewer(request)
  }

}