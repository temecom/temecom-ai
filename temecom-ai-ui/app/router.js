import EmberRouter from '@ember/routing/router';
import config from './config/environment';

const Router = EmberRouter.extend({
  location: config.locationType,
  rootURL: config.rootURL
});

Router.map(function() {
  this.route('configuration', function() {
    this.route('templates');
    this.route('template');
    this.route('training');
  });
});

export default Router;
