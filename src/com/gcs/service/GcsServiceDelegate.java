package com.gcs.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@javax.jws.WebService(targetNamespace = "http://service.gcs.com/", serviceName = "GcsServiceService", portName = "GcsServicePort", wsdlLocation = "WEB-INF/wsdl/GcsServiceService.wsdl")
@javax.xml.ws.BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
@SOAPBinding(style = Style.RPC)
public class GcsServiceDelegate {

	com.gcs.service.GcsService gcsService = new com.gcs.service.GcsService();

	public String csg_message(@WebParam(name="vssid")String vssid, @WebParam(name="data")String data, @WebParam(name="token")String token) {
		return gcsService.csg_message(vssid, data, token);
	}

}