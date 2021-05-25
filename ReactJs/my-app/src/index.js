import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//import App from './App';
//import Stateless from './Stateless';
//import Statefull from './Statefull';
//import State from './State';
//import StateProps from './StateProps';
//import ComponentCircle from './ComponentCircle';
import ComponentApi from './ComponentApi';

import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
   <ComponentApi />
  </React.StrictMode>,
  document.getElementById('root')
);



// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
