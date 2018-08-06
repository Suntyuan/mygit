package y2ssh.zhangcuishan.web.form;

import org.apache.struts.action.ActionForm;

import y2ssh.zhangcuishan.entity.Goods;

@SuppressWarnings("serial")
public class GoodsForm extends ActionForm {
	
	private Goods item = new Goods();
	public Goods getItem() {
		return item;
	}
	public void setItem(Goods item) {
		this.item = item;
	}	
}