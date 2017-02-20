package com.talespin.webservices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.talespin.users.model.Attachment;
import com.talespin.users.model.Product;
import com.talespin.users.model.ProductLine;
import com.talespin.users.service.InsertService;
import com.talespin.users.service.ViewService;

@RestController
@RequestMapping(value = "/rest", method = { RequestMethod.GET, RequestMethod.POST })
public class DataRestController {

	@Autowired
	private ViewService viewService;

	@Autowired
	private InsertService insertService;

	@RequestMapping(value = "getL3DataFromL2", method = RequestMethod.GET)
	Map<Object, Object> getL3DataFromL2(@RequestParam String id, HttpServletRequest request) {

		Map<Object, Object> mainMap = new HashMap<>();

		List<ProductLine> productLineList = (List<ProductLine>) this.viewService.searchByOneColumn(ProductLine.class,
				"subcategoryId", id);
		List<Attachment> attachmentList = (List<Attachment>) this.viewService.searchAllData(Attachment.class);

		Iterator<ProductLine> productLineItr = productLineList.iterator();
		while (productLineItr.hasNext()) {
			ProductLine productLine = (ProductLine) productLineItr.next();

			Iterator<Attachment> attachmentItr = attachmentList.iterator();
			while (attachmentItr.hasNext()) {
				Attachment attachment = (Attachment) attachmentItr.next();
				if (productLine.getAttachmentId() != null && productLine.getAttachmentId().equals(attachment.getId())) {
					if (request.getServerPort() != 0) {
						productLine.setImage(request.getScheme() + "://" + request.getServerName() + ":"
								+ request.getServerPort() + request.getContextPath() + "/doc/" + attachment.getLink()
								+ attachment.getEncryptedAttachment());
					} else {
						productLine.setImage(
								request.getScheme() + "://" + request.getServerName() + request.getContextPath()
										+ "/doc/" + attachment.getLink() + attachment.getEncryptedAttachment());
					}
				}
			}
		}

		mainMap.put("data", productLineList);
		mainMap.put("token", "for token purpose");
		mainMap.put("message", "Success");
		mainMap.put("status", true);

		return mainMap;
	}

	@RequestMapping(value = "/controller", method = RequestMethod.POST)
	public Map<String, Object> getMovie(@RequestBody String apirequest) {
			System.out.println("hello");
		try { 
			JSONObject jsonobj = new JSONObject(apirequest);
			JSONObject result = jsonobj.getJSONObject("result");
			JSONObject paramenters = result.getJSONObject("parameters");
			
			Iterator<String> keys = paramenters.keys();
			Map<String, String> parameterData = new HashMap<>();

			while (keys.hasNext()) {
				String key = keys.next();
				String val = paramenters.getString(key).toString();
				if (val != null && !val.isEmpty()) {
					parameterData.put(key, val);
				}
			}
			System.out.println(parameterData.size());

			HashMap<String, List<Product>> data = new HashMap<>();
			if (parameterData.size() == 1) {
				
				if (parameterData.containsKey("l3")) {
					
						
					List<ProductLine> productLineList = (List<ProductLine>) this.viewService
							.searchByOneColumn(ProductLine.class, "productLine", parameterData.get("l3"));
					System.out.println(productLineList.toString());
					
					if (productLineList != null && productLineList.size() > 0) {
						
						for (ProductLine productLine2 : productLineList) {

							List<Product> productList = (List<Product>) this.viewService
									.searchByOneColumn(Product.class, "productLineId", productLine2.getId());
							
							data.put("productList", productList);
							
						}

					} else {

					}

					/*
					 * List<Product> product = (List<Product>)
					 * this.viewService.searchByOneColumn(Product.class,
					 * "productLineId", productLine.getId());
					 */

				}

			} else if (parameterData.size() == 2) {

			} else if (parameterData.size() == 3) {

			} else if (parameterData.size() == 4) {

			} else if (parameterData.size() == 5) {

			}
			
			String productName = data.get("productList").get(0).getProductName();
			int productPrice = data.get("productList").get(0).getMrp();
		
			String speech = "Here i have found you a match :) " +"\""+ productName +"\"" +" " +"and it will cost you just " + productPrice+"INR";
			Map<String, Object> tempMap = new HashMap<String, Object>();
			System.out.println(speech);
			tempMap.put("speech",speech );
			tempMap.put("displayText", "hello world");
			tempMap.put("data", "");
			tempMap.put("contextOut", new ArrayList<String>());
			tempMap.put("source", "Project on github");

			return tempMap;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
