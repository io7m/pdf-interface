package com.io7m.pdf.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.io7m.pdf.api.PDFViewerType

class PDFFragment : Fragment() {

  private lateinit var viewer: PDFViewerType

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    // XXX: Error handling

    val listener =
      this.activity as PDFFragmentListenerType

    this.viewer = listener.onReaderWantsPDFViewer()
  }

  override fun onStart() {
    super.onStart()

    // XXX: Set up event listeners, set up UI to send calls to this.viewer
  }

}