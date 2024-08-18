import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ShuttleService {
  private baseUrl = '/api/shuttles';

  constructor(private http: HttpClient) {}

  getShuttles(): Observable<any[]> {
    return this.http.get<any[]>(this.baseUrl);
  }
}
