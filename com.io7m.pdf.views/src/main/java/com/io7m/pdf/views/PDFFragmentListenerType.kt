package com.io7m.pdf.views

import com.io7m.pdf.api.PDFViewerType

interface PDFFragmentListenerType {

  fun onReaderWantsPDFViewer(): PDFViewerType

}