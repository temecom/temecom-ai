import Component from '@ember/component';


export default Component.extend({
	actions: {
		setSelection: function(value) {
			this.sendAction('selected', value);
		}
	}
});
