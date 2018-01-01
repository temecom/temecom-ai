import Component from '@ember/component';

export default Component.extend({
	classNames: ['card mb-4'],
	tableDefinition: null,
	items: null,
	actions: {
		delete: function(selectedItem) {
			this.send("delete", selectedItem);
		},
		new: function() {
			this.send("new");
		}
	}
});
