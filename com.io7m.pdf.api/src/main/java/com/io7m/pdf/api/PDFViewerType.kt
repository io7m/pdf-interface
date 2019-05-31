package com.io7m.pdf.api

import android.view.View

interface PDFViewerType {

  fun createView(): View

  fun nextPage()

  fun previousPage()

  fun tableOfContents(): List<PDFTOCItem>

}
