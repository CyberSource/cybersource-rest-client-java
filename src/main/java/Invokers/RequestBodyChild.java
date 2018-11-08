package Invokers;

import java.io.IOException;
import java.nio.charset.Charset;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.internal.Util;

import okio.BufferedSink;

public class RequestBodyChild extends RequestBody{

	@Override
	public MediaType contentType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeTo(BufferedSink sink) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	/**
	   * Returns a new request body that transmits {@code content}. If {@code
	   * contentType} is non-null and lacks a charset, this will use UTF-8.
	   * @param contentType (required content-type)
	   * @param content (required body)
	   * @return RequestBody generated.
	   */
	  public static RequestBody create(MediaType contentType, String content) {
	    Charset charset = Util.UTF_8;
	    if (contentType != null) {
	      charset = contentType.charset();
	      if (charset == null) {
	        charset = Util.UTF_8;
	        contentType = MediaType.parse(contentType.toString());
	      }
	    }
	    byte[] bytes = content.getBytes(charset);
	    return create(contentType, bytes);
	  }

}
