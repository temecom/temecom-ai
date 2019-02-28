import Component from '@ember/component';

export default Component.extend({
	classNames: ['card mb-4'],
	tableDefinition: null,
	items: null,
	actions: {
		deleteItem: function(selectedItem) {
			this.get("deleteItem")(selectedItem);
		},
		newItem: function() {
			this.get("newItem")();
		},
		addItem: function(item) {
			this.get("addItem")(item);
		},
		itemSelected: function(item) {
			this.get("itemSelected")(item);
		}
	}
});
