
const gwtLibrary = require('./target/troubleshoot-1-1.0.0-SNAPSHOT/Troubleshoot1/Troubleshoot1.nocache.js');

// troubleshoot1scope should be present in the current scope (exported by gwt)
var result = gwtLibrary.troubleshoot1scope.troubleshoot1function();

console.log(result);
