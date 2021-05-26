import {GET_POST_LIST, GET_POST_LIST_SUCCESS} from './constant';

export const getPostList = (payout) => {
    return(
        ()=>{
            type: GET_POST_LIST,
            payout
        }
    );
}

export const getPostListSuccess = (payout) => {
    return(
        ()=>{
            type: GET_POST_LIST_SUCCESS,
            payout
        }
    );
}