import Component from '@ember/component';

export default Component.extend({
	actions: {
		itemSelected: function(item) {
			this.get('action')(item);
		}
	}
});
