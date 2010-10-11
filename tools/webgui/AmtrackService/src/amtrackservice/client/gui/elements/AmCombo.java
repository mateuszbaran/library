package amtrackservice.client.gui.elements;

import java.util.HashMap;
import amtrackservice.client.MapList;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class AmCombo extends AmWidget {

	private ListBox amCombo;
	private MapList<String,String> entry;
	private MapList<String,String> preset;
	private String data;
	
	public AmCombo(String label, String datatype, HTML description,
			MapList<String, String> entry, MapList<String, String> preset,
			String dataX) {
		super(label, datatype, description);
		this.entry = entry;
		this.amCombo = new ListBox(false);
		for(String item : entry.getKeys()){
			String value = entry.getValue(item);
			amCombo.addItem(item, value);
			if(value.equals(preset.getValues().get(0)))
				amCombo.setSelectedIndex(amCombo.getItemCount()-1);
		}
		this.data = dataX;
	}

	@Override
	public String getValue() {
		return amCombo.getValue(amCombo.getSelectedIndex());
	}

	@Override
	public Widget getWidget() {
		return amCombo;
	}

	@Override
	public void setValue(HashMap<String, String> valueMap) {
		//unimplemented
	}

	@Override
	public String getDataLink() {
		return data;
	}

}