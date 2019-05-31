package com.io7m.pdf.pdfviewer

import android.view.View
import com.io7m.pdf.api.PDFTOCItem
import com.io7m.pdf.api.PDFViewerType
import com.io7m.pdf.api.PDFViewersRequest

class PVViewer(request: PDFViewersRequest) : PDFViewerType {

  override fun nextPage() {
    TODO()
  }

  override fun previousPage() {
    TODO()
  }

  override fun tableOfContents(): List<PDFTOCItem> {
    TODO()
  }

  init {
    // Set up PDF Viewer with inputstream, etc
    TODO()
  }

  override fun createView(): View {
    TODO()
  }

}