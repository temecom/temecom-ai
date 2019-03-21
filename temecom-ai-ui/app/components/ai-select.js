import Component from '@ember/component';


export default Component.extend({
	items: null, 
	value: null, 
	actions: {
		setSelection: function(value) {
			var item = this.get('items').find(function(item) {
				return item.get('id') === value; 
			})
			this.sendAction('selected', item);
		}
	}
});
