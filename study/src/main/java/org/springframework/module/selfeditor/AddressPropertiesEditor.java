package org.springframework.module.selfeditor;

import java.beans.PropertyEditorSupport;

public class AddressPropertiesEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] s = text.split("_");
		Address address = new Address();
		address.setProvice(s[0]);
		address.setCity(s[1]);
		address.setTown(s[2]);
		// 将转换好address返回
		setValue(address);
	}
}
