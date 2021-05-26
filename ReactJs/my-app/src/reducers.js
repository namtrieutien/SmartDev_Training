import { GET_POST_LIST, GET_POST_LIST_SUCCESS } from "./constant";

const postsReducers = (state = INIT_STATE, action) =>{
    switch(action.type){
        case GET_POST_LIST:
            return{
                ...state,
                load: true
            };
        case GET_POST_LIST_SUCCESS:
            const data = action.payload;
            return{
                ...state,
                posts: data,
                load: false
            };
        default:
            return;

    }
}

export default postsReducers;