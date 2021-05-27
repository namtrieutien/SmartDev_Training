import { combineReducers } from 'redux';
import postsReducer from '../reducers';

const rootReducer = combineReducers({
    posts: postsReducer,
});

export default rootReducer;