import request from '@/utils/request'

export function getList(data) {
    return request({
      url: '/indent/find',
      method: 'post',
      data
    })
  }
  